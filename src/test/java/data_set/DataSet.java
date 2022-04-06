package data_set;

import org.testng.annotations.DataProvider;

public class DataSet {

    @DataProvider(name = "signupData")
    public static Object[][] signupInfo() {
        Object[][] data = {
                {"Sakib Al Hasan", "sakib@gmail.com", "abc12345"},
                {"Mehedi Hasan", "mehedi@gmail.com", "1234abcd"}

        };
        return data;
    }

    @DataProvider(name = "loginData")
    public static Object[][] loginInfo() {
        Object[][] data = {
                {"sakib@gmail.com", "abc12345"},
                {"mehedi@gmail.com", "1234abcd"}
        };
        return data;
    }

}
