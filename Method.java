
import java.util.List;


public class Method {
	
	//최고자산
	public static void best(List<GuyVO> ls){
		int asset  = 0;
		String name = null;
		
		for(GuyVO e : ls){
			if(asset<=e.getAsset()){
				asset = e.getAsset();
				name = e.getName();
			}
		}
		System.out.println("최고의 자산 : "+name+", 규모 : "+asset+"억");
	}
	
	//부모의 자산 평균
	public static void avg(List<GuyVO> ls)  {
		int asset = 0;
		try{
			for(GuyVO e : ls){
				if(e.getAsset()==0){
					throw new AssetException(e.getName());
				}
				asset = asset+e.getAsset();
			}
			System.out.println("부모자산의 평균 : "+asset/ls.size());
		}catch(AssetException e){
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
