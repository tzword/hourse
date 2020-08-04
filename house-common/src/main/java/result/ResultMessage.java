package result;

/**
 * @author jianghy
 * @Description: 返回信息
 * @date 2020/8/3 9:09
 */
public class ResultMessage {
    private String successMsg;
    private String errorMsg;

    public String getSuccessMsg() {
        return successMsg;
    }

    public void setSuccessMsg(String successMsg) {
        this.successMsg = successMsg;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public static ResultMessage successMsg(String msg){
        ResultMessage result = new ResultMessage();
        result.setSuccessMsg(msg);
        return result;
    }

    public static ResultMessage errorMsg(String msg){
        ResultMessage result = new ResultMessage();
        result.setErrorMsg(msg);
        return result;
    }
}
