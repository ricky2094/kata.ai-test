package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object urlLogin
     
    /**
     * <p></p>
     */
    public static Object urlSignUp
     
    /**
     * <p></p>
     */
    public static Object loginUserName
     
    /**
     * <p></p>
     */
    public static Object loginPassword
     
    /**
     * <p></p>
     */
    public static Object signUpUsername
     
    /**
     * <p></p>
     */
    public static Object signUpEmail
     
    /**
     * <p></p>
     */
    public static Object signUpCompany
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            urlLogin = selectedVariables['urlLogin']
            urlSignUp = selectedVariables['urlSignUp']
            loginUserName = selectedVariables['loginUserName']
            loginPassword = selectedVariables['loginPassword']
            signUpUsername = selectedVariables['signUpUsername']
            signUpEmail = selectedVariables['signUpEmail']
            signUpCompany = selectedVariables['signUpCompany']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
