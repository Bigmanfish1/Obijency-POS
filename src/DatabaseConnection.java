
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import net.ucanaccess.jdbc.UcanaccessSQLException.*;

/**
 *
 * @author victorg
 */
//obichukwu 
public class DatabaseConnection {

    private static Connection conn = null;
    private String username;
    private String password;
    private String name;
    private String surname;
    public DatabaseConnection[] dd = new DatabaseConnection[100];

    //constructor method: sets up connection
    public DatabaseConnection() {
        try {
            conn = DriverManager.getConnection("jdbc:ucanaccess://pat.accdb");
            System.out.println("Connection successful");
        } catch (Exception e) {
            System.out.println("Connection NOT successful\n");
            e.printStackTrace();
        }
    }

    public ResultSet displayStock() {
        ResultSet rs = null;
        try {
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://pat.accdb");
            Statement s = conn.createStatement();
            String qry = "SELECT * FROM Stock;";
            rs = s.executeQuery(qry);

        } catch (Exception e) {

            e.printStackTrace();

        }
        return rs;
    }

    public ResultSet displayPriceList() {
        ResultSet rs = null;
        try {
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://pat.accdb");
            Statement s = conn.createStatement();
            String qry = "SELECT * FROM PriceList;";
            rs = s.executeQuery(qry);

        } catch (Exception e) {

            e.printStackTrace();

        }
        return rs;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String p) {
        password = p;
    }

    public void setUsername(String u) {
        username = u;
    }

    public Boolean validateSignUpName(String n) {
        name = n;
        int index = 0;
        boolean found = false;

        while (found == false && index < name.length()) {
            if ((Character.isDigit(name.charAt(index)))) {
                found = true;
            } else {
                found = false;
                index++;
            }
        }
        return found;
    }

    public Boolean validateSignUpSurname(String s) {
        surname = s;
        int index = 0;
        boolean found = false;

        while (found == false && index < surname.length()) {
            if ((Character.isDigit(surname.charAt(index)))) {
                found = true;
            } else {
                found = false;
                index++;
            }
        }
        return found;
    }

    public Boolean validatePassword(String ps, String cps) {
        Boolean match = false;
        password = ps;
        if (password.equals(cps)) {
            match = true;
        } else {
            match = false;
        }
        return match;
    }

    public Boolean validateUsername(String user) {
        ResultSet rs = null;
        Boolean match = false;
        try {
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://pat.accdb");
            Statement s = conn.createStatement();
            String qry = "SELECT * FROM Users WHERE Username='" + user + "';";
            rs = s.executeQuery(qry);
            if (!(rs.next())) {
                match = false;
            } else {
                match = true;
            }

        } catch (Exception e) {

            e.printStackTrace();

        }

        return match;
    }

    public void addUser(String name, String sur, String status, String dob, String user, String password) {
        int num;
        try {
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://pat.accdb");
            PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(
                    "insert into Users(Name, Surname, Status, DOB, Username, Password) values(?,?,?,?,?,?)");
            pstmt.setString(1, name);
            pstmt.setString(2, sur);
            pstmt.setString(3, status);
            pstmt.setString(4, dob);
            pstmt.setString(5, user);
            pstmt.setString(6, password);
            num = pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException n) {
            n.printStackTrace();
            System.out.println("An error occurred");
        }

    }

    public Boolean validateSignIn(String u, String p, String t) {
        Boolean match = false;
        try {
            ResultSet rs = null;
            Connection conn
                    = DriverManager.getConnection("jdbc:ucanaccess://pat.accdb");
            Statement s = conn.createStatement();
            String qry = "SELECT * FROM Users WHERE Username='" + u
                    + "' AND Password = '" + p + "' AND Status = '" + t + "'";
            rs = s.executeQuery(qry);
            if (rs.next()) {
                match = true;
            } else {
                match = false;
            }
        } catch (Exception e) {
            System.out.println("An error has occured.");
        }
        return match;
    }

    public ResultSet displayUser() {
        ResultSet rs = null;
        try {
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://pat.accdb");
            Statement s = conn.createStatement();
            String qry = "SELECT * FROM Users;";
            rs = s.executeQuery(qry);

        } catch (Exception e) {

            e.printStackTrace();

        }
        return rs;
    }

    public ResultSet displayTransactionHistory() {
        ResultSet rs = null;
        try {
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://pat.accdb");
            Statement s = conn.createStatement();
            String qry = "SELECT * FROM Transaction;";
            rs = s.executeQuery(qry);

        } catch (Exception e) {

            e.printStackTrace();

        }
        return rs;
    }

    public ResultSet displayLoginTable() {
        ResultSet rs = null;
        try {
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://pat.accdb");
            Statement s = conn.createStatement();
            String qry = "SELECT * FROM Login;";
            rs = s.executeQuery(qry);

        } catch (Exception e) {

            e.printStackTrace();

        }
        return rs;
    }

    public ResultSet displayDebtors() {
        ResultSet rs = null;
        try {
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://pat.accdb");
            Statement s = conn.createStatement();
            String qry = "SELECT * FROM Debtors;";
            rs = s.executeQuery(qry);

        } catch (Exception e) {

            e.printStackTrace();

        }
        return rs;
    }

    public ResultSet displayBackendAccounting() {
        ResultSet rs = null;
        try {
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://pat.accdb");
            Statement s = conn.createStatement();
            String qry = "SELECT * FROM BackendAccounting;";
            rs = s.executeQuery(qry);

        } catch (Exception e) {

            e.printStackTrace();

        }
        return rs;
    }

    public void addLogin(String u, String p) {
        try {
            String status = "", timeStamp = "";
            int user = 0, row = 0;
            ResultSet rs = null;
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://pat.accdb");
            Statement s = conn.createStatement();
            String qry = "SELECT UserID, Name, Surname, Status FROM Users WHERE Username = '" + u
                    + "' AND Password = '" + p + "';";
            rs = s.executeQuery(qry);
            if (rs.next()) {
                user = Integer.parseInt(rs.getString("UserID"));
                status = rs.getString("Status");
                timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
            }
            PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(
                    "insert into Login(Status, LoginTime, UserID) values(?,?,?)");
            pstmt.setString(1, status);
            pstmt.setString(2, timeStamp);
            pstmt.setInt(3, user);
            row = pstmt.executeUpdate();
            pstmt.close();

        } catch (Exception e) {
        }
    }

    public String applySettings() {
        ResultSet rs = null, rc = null;
        String line = "", name = "", sur = "", status = "", username = "",
                password = "";
        try {
            int user = 0;
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://pat.accdb");
            Statement s = conn.createStatement();
            String qry = "select top 1 UserID from login order by LoginID DESC;";
            rs = s.executeQuery(qry);

            if (rs.next()) {
                user = Integer.parseInt(rs.getString("UserID"));
            }
            PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(
                    "select Name, Surname, Status,Username, Password from Users "
                    + "where UserID = ?");
            pstmt.setInt(1, user);
            rc = pstmt.executeQuery();
            if (rc.next()) {
                name = rc.getString("Name");
                sur = rc.getString("Surname");
                status = rc.getString("Status");
                username = rc.getString("Username");
                password = rc.getString("Password");
            }

            line = name + "," + sur + "," + username + "," + password + ","
                    + status;
        } catch (Exception e) {
        }
        return line;
    }

    public int addDebtor(String n, String s, double ao, int tID, String pn,
            String e, String id) {
        int row = 0;
        try {
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://pat.accdb");
            PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(
                    "insert into Debtors(Name,Surname,AmountOwed,TransactionID,PhoneNumber,"
                    + "EmailAddress,IDNumber) values(?,?,?,?,?,?,?)");
            pstmt.setString(1, n);
            pstmt.setString(2, s);
            pstmt.setDouble(3, ao);
            pstmt.setInt(4, tID);
            pstmt.setString(5, pn);
            pstmt.setString(6, e);
            pstmt.setString(7, id);
            row = pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException m) {
        }
        return row;
    }

    public void addTransaction(Double ag, Double ta, String Type) {
        int row = 0;
        try {
            String time = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://pat.accdb");
            PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(
                    "insert into Transaction(TimeStamp, AmountGiven, TotalAmount,Type)"
                    + "values(?,?,?,?)");
            pstmt.setString(1, time);
            pstmt.setDouble(2, ag);
            pstmt.setDouble(3, ta);
            pstmt.setString(4, Type);
            row = pstmt.executeUpdate();
            pstmt.close();
        } catch (Exception e) {

        }
    }

    public ResultSet PriceDesc() {
        ResultSet rs = null;
        try {
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://pat.accdb");
            Statement s = conn.createStatement();
            String qry = "SELECT * FROM PriceList ORDER BY Price DESC;";
            rs = s.executeQuery(qry);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public ResultSet PriceAsc() {
        ResultSet rs = null;
        try {
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://pat.accdb");
            Statement s = conn.createStatement();
            String qry = "SELECT * FROM PriceList ORDER BY Price ASC;";
            rs = s.executeQuery(qry);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return rs;
    }

    public ResultSet alphabetical() {
        ResultSet rs = null;
        try {
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://pat.accdb");
            Statement s = conn.createStatement();
            String qry = "SELECT * FROM Stock ORDER BY ProductName;";
            rs = s.executeQuery(qry);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public ResultSet countAsc() {
        ResultSet rs = null;
        try {
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://pat.accdb");
            Statement s = conn.createStatement();
            String qry = "SELECT * FROM Stock ORDER BY ProductCount ASC;";
            rs = s.executeQuery(qry);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public ResultSet countDesc() {
        ResultSet rs = null;
        try {
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://pat.accdb");
            Statement s = conn.createStatement();
            String qry = "SELECT * FROM Stock ORDER BY ProductCount DESC;";
            rs = s.executeQuery(qry);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public ResultSet asc() {
        ResultSet rs = null;
        try {
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://pat.accdb");
            Statement s = conn.createStatement();
            String qry = "SELECT * FROM Stock ORDER BY ProductID ASC;";
            rs = s.executeQuery(qry);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public ResultSet desc() {
        ResultSet rs = null;
        try {
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://pat.accdb");
            Statement s = conn.createStatement();
            String qry = "SELECT * FROM Stock ORDER BY ProductID DESC;";
            rs = s.executeQuery(qry);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public int addProduct(String n, String t, int c, String b, double pr,
            double cp) {
        int row = 0, rows = 0;
        try {
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://pat.accdb");
            PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(
                    "insert into Stock(ProductName, ProductType, ProductCount, PriceID,"
                    + "Barcode) values(?,?,?,MAX(PriceID)+1,?)");
            pstmt.setString(1, n);
            pstmt.setString(2, t);
            pstmt.setInt(3, c);
            pstmt.setString(4, b);
            row = pstmt.executeUpdate();
            pstmt.close();

            PreparedStatement pst = (PreparedStatement) conn.prepareStatement(""
                    + "insert into PriceList(ProductID, CostPrice, Price) "
                    + "values(MAX(ProductID)+1,?,?)");
            pst.setDouble(2, cp);
            pst.setDouble(3, pr);
            rows = pst.executeUpdate();
            pst.close();
        } catch (Exception e) {
        }
        return row;
    }

    public int removeProduct(int pID) {
        int row = 0;
        try {
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://pat.accdb");
            PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(
                    "delete from Stock where ProductID = ?;");
            pstmt.setInt(1, pID);
            row = pstmt.executeUpdate();
            pstmt.close();

        } catch (Exception e) {

        }

        return row;
    }

    public int removeDebtor(int dID) {
        int row = 0;
        ResultSet rs = null;
        try {
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://pat.accdb");
            PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(
                    "delete from Debtors where DebtorsID = ?;");
            pstmt.setInt(1, dID);
            row = pstmt.executeUpdate();
            pstmt.close();
        } catch (Exception e) {
        }

        return row;
    }

    public int editDebtor(int dID, String opt, String newValue) {
        int row = 0;
        try {
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://pat.accdb");
            if (opt.equalsIgnoreCase("Name")) {
                PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(
                        "update Debtors set Name = ? where DebtorsID = ?");
                pstmt.setString(1, newValue);
                pstmt.setInt(2, dID);
                row = pstmt.executeUpdate();
            } else if (opt.equalsIgnoreCase("Surname")) {
                PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(
                        "update Debtors set Surname = ? where DebtorsID = ?");
                pstmt.setString(1, newValue);
                pstmt.setInt(2, dID);
                row = pstmt.executeUpdate();
            } else if (opt.equalsIgnoreCase("PhoneNumber")) {
                PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(
                        "update Debtors set PhoneNumber = ? where DebtorsID = ?");
                pstmt.setString(1, newValue);
                pstmt.setInt(2, dID);
                row = pstmt.executeUpdate();
            } else if (opt.equalsIgnoreCase("EmailAddress")) {
                PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(
                        "update Debtors set PhoneNumber = ? where DebtorsID = ?");
                pstmt.setString(1, newValue);
                pstmt.setInt(2, dID);
                row = pstmt.executeUpdate();
            }
        } catch (Exception e) {
        }
        return row;
    }

    public int updateStockCount(int pID, int amountAdd) {
        int row = 0;
        try {
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://pat.accdb");
            PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(
                    "update Stock set ProductCount = ProductCount+? where ProductID = ?");
            pstmt.setInt(1, amountAdd);
            pstmt.setInt(2, pID);
            row = pstmt.executeUpdate();
        } catch (Exception e) {
        }
        return row;
    }

    public int editPrice(int prID, String opt, double pr) {
        int row = 0;
        try {
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://pat.accdb");
            if (opt.equalsIgnoreCase("CostPrice")) {
                PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(
                        "update PriceList set CostPrice = ? where PriceID = ?");
                pstmt.setDouble(1, pr);
                pstmt.setInt(2, prID);
                row = pstmt.executeUpdate();
            } else if (opt.equalsIgnoreCase("Price")) {
                PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(
                        "update PriceList set Price = ? where PriceID = ?");
                pstmt.setDouble(1, pr);
                pstmt.setInt(2, prID);
                row = pstmt.executeUpdate();
            }
        } catch (Exception e) {
        }
        return row;
    }

    public int editUserTable(int uID, String opt, String newVal) {// admin user
        int row = 0;
        try {
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://pat.accdb");
            if (opt.equalsIgnoreCase("Name")) {
                PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(
                        "update Users set Name = ? where UserID = ?");
                pstmt.setString(1, newVal);
                pstmt.setInt(2, uID);
                row = pstmt.executeUpdate();
            } else if (opt.equalsIgnoreCase("Surname")) {
                PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(
                        "update Users set Surname = ? where UserID = ?");
                pstmt.setString(1, newVal);
                pstmt.setInt(2, uID);
                row = pstmt.executeUpdate();
            } else if (opt.equalsIgnoreCase("Status")) {
                PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(
                        "update Users set Status = ? where UserID = ?");
                pstmt.setString(1, newVal);
                pstmt.setInt(2, uID);
                row = pstmt.executeUpdate();
            } else if (opt.equalsIgnoreCase("Username")) {
                PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(
                        "update Users set Username = ? where UserID = ?");
                pstmt.setString(1, newVal);
                pstmt.setInt(2, uID);
                row = pstmt.executeUpdate();
            } else if (opt.equalsIgnoreCase("Password")) {
                PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(
                        "update Users set Password = ? where UserID = ?");
                pstmt.setString(1, newVal);
                pstmt.setInt(2, uID);
                row = pstmt.executeUpdate();
            }
        } catch (Exception e) {
        }
        return row;
    }

    public ResultSet displayBasedOnDateLogin(String dateFrom, String dateTo) {
        ResultSet rs = null;
        int row = 0;
        try {
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://pat.accdb");
            PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(
                    "SELECT * FROM Login WHERE LoginTime BETWEEN ? AND ?");
            pstmt.setString(1, dateFrom);
            pstmt.setString(2, dateTo);
            rs = pstmt.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public ResultSet displayBasedOnDateTransaction(String dateFrom, String dateTo) {
        ResultSet rs = null;
        int row = 0;
        try {
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://pat.accdb");
            PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(
                    "SELECT * FROM Transaction WHERE TimeStamp BETWEEN ? AND ?");
            pstmt.setString(1, dateFrom);
            pstmt.setString(2, dateTo);
            rs = pstmt.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public ResultSet displayBasedOnDateBackend(String dateFrom, String dateTo) {
        ResultSet rs = null;
        int row = 0;
        try {
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://pat.accdb");
            PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(
                    "SELECT * FROM BackendAccounting WHERE Date BETWEEN ? AND ?");
            pstmt.setString(1, dateFrom);
            pstmt.setString(2, dateTo);
            rs = pstmt.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public ResultSet orderTransaction(String opt) {
        ResultSet rs = null;
        try {
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://pat.accdb");

            if (opt.equalsIgnoreCase("ASC")) {
                Statement s = conn.createStatement();
                String qry = "SELECT * FROM Transaction ORDER BY TotalAmount ASC;";
                rs = s.executeQuery(qry);
            } else if (opt.equalsIgnoreCase("DESC")) {
                Statement s = conn.createStatement();
                String qry = "SELECT * FROM Transaction ORDER BY TotalAmount DESC;";
                rs = s.executeQuery(qry);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return rs;
    }

    public int addAdditional(String type, double ag, double ta, String password) {
        int row = 0;
        boolean match = false;
        try {
                PreparedStatement ptmt = (PreparedStatement) conn.prepareStatement(
                        "insert into Transaction(TimeStamp, AmountGiven, TotalAmount, Type)"
                        + "values(?,?,?,?)");
                String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
                ptmt.setString(1, timeStamp);
                ptmt.setDouble(2, ag);
                ptmt.setDouble(3, ta);
                ptmt.setString(4, type);
                row = ptmt.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return row;
    }

    public int saveSettings(String n, String ss, String u, String p) {
        int row = 0;
        try {
            ResultSet rs = null; 
            int user = 0;
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://pat.accdb");
            Statement s = conn.createStatement();
            String qry = "select top 1 UserID from login order by LoginID DESC;";
            rs = s.executeQuery(qry);

            if (rs.next()) {
                user = Integer.parseInt(rs.getString("UserID"));
            }
            PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(
                   "update Users set Name = ?, Surname = ?, Username = ?, "
                           + "Password = ? where UserID = ?");
            pstmt.setString(1, n);
            pstmt.setString(2, ss);
            pstmt.setString(3, u);
            pstmt.setString(4, p);
            pstmt.setInt(5, user);
            row = pstmt.executeUpdate();
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return row;
    }
    
    public ResultSet getBarcodeProduct(String bar){
        ResultSet rs = null;
        try {
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://pat.accdb");
            PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(
            "SELECT Stock.Barcode, Stock.ProductName, PriceList.Price, Stock.ProductType\n" +
"FROM Stock \n" +
"LEFT JOIN PriceList\n" +
"ON Stock.ProductID = PriceList.ProductID \n" +
"WHERE Barcode = ?");
            pstmt.setString(1, bar);
            rs = pstmt.executeQuery();
        } catch (Exception e) {
        }
        return rs;
    }
    
    
    public String getPriceFromProduct(String p){
        double price = 0;
        String pr = "";
        ResultSet rs = null, rss = null;
            int id = 0;
        try {
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://pat.accdb");
            Statement s = conn.createStatement();
            String qry = "SELECT * FROM Stock WHERE ProductName = '" + p + "';";
            rs = s.executeQuery(qry);
            
            if (rs.next()) {
                id = Integer.parseInt(rs.getString("ProductID"));
            }
            
            PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(
                    "SELECT * FROM PriceList WHERE ProductID = ?");
            pstmt.setInt(1, id);
            rss = pstmt.executeQuery();
            
            if (rss.next()) {
                pr = rss.getString("Price");
            }
        } catch (Exception e) {
        }
        
        return pr;
    }
    
    public Boolean getUserType(){
        boolean match = false;
        ResultSet rs = null, rc = null;
        try {
            int user = 0;
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://pat.accdb");
            Statement s = conn.createStatement();
            String qry = "select top 1 UserID from login order by LoginID DESC;";
            rs = s.executeQuery(qry);
            
            if(rs.next()){
                user = Integer.parseInt(rs.getString("UserID"));
            }
            PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(
                    "select * from Users where UserID = ? and Status = ?");
            pstmt.setInt(1, user);
            pstmt.setString(2, "admin");
            rc = pstmt.executeQuery();
            if(rc.next()){
                match = true;
            }
            else{
                match = false;
            }
        } catch (Exception e) {
        }
        
        return match;
    }
    
    public ResultSet TransactionsForDay(){
        ResultSet rs = null;
        String timeStamp = "";
        try {
            timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
            String year = timeStamp.substring(0, 4);
            String month = timeStamp.substring(4, 6);
            String day = timeStamp.substring(6, 8);
            String dateFrom = year + month + day + "_000000";
            String dateTo = year + month + day + "_235959";
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://pat.accdb");
            PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(
                    "SELECT * FROM Transaction WHERE TimeStamp BETWEEN ? and ?;");
            pstmt.setString(1, dateFrom);
            pstmt.setString(2, dateTo);
            rs = pstmt.executeQuery();
        } catch (Exception e) {
        }
        
        return rs;
    }
    
    public String getBalanceForDay(){
        String bal = "", timeStamp = "";
        ResultSet rs = null;
        try {
            timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
            String year = timeStamp.substring(0, 4);
            String month = timeStamp.substring(4, 6);
            String day = timeStamp.substring(6, 8);
            String dateFrom = year + month + day + "_000000";
            String dateTo = year + month + day + "_235959";
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://pat.accdb");
            PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(
                    "SELECT SUM(TotalAmount) AS Total FROM Transaction WHERE TimeStamp"
                            + "BETWEEN ? AND ?");
            pstmt.setString(1, dateFrom);
            pstmt.setString(2, dateTo);
            rs = pstmt.executeQuery();
            bal = rs.getString("Total");
        } catch (Exception e) {
        }
        return bal;
    }
    
    public Boolean validateAdminPassword(String p){
        ResultSet rs = null;
        boolean match = false;
        try {
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://pat.accdb");
            PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(
                    "select * from Users where Password = ? AND Status = ?");
            pstmt.setString(1, password);
            pstmt.setString(2, "admin");
            rs = pstmt.executeQuery();
            if (rs.next()) {
                match = true;
            }
            else{
                match = false;
            }
        } catch (Exception e) {
        }
        return match;
    }
    
    
}
