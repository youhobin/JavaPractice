class UnsupportedFuncionException extends RuntimeException{
	final private int ERR_CODE;
	
	UnsupportedFuncionException(String msg, int errCode) {
		super(msg);
		ERR_CODE = errCode;
	}
	
	UnsupportedFuncionException(String msg) {
		this(msg,100);
	}

	public int getErrorCode() {
		return ERR_CODE;
	}
	
	public String getMessage() {
		return "[" + getErrorCode() + "]" + super.getMessage();
	}
}

public class Ex8_9 {

	public static void main(String[] args) throws Exception{
		throw new UnsupportedFuncionException("지원하지 않는 기능입니다.", 1500);
	}

}
