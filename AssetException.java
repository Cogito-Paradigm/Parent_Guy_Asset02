
class AssetException extends Exception{
	AssetException(){
	}
	AssetException(String msg){
		super(msg);
	}
	
	public String getMessage(){
		return super.getMessage()+"의 자산이 없습니다.";
	}
}