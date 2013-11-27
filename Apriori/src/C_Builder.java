import java.util.ArrayList;
import java.util.HashMap;

public class C_Builder {
	public C_Builder(){}
	
	public void build_Cn(int n, L_List L, C_List C){
		C.clear();
		
		HashMap<ArrayList<String>, Float> L1 = L.get_Ln(1);
		HashMap<ArrayList<String>, Float> Lnm1 = L.get_Ln(n-1);
		
		for(ArrayList<String> item_Lnm1 : Lnm1.keySet()){
			for(ArrayList<String> item_L1 : L1.keySet()){				
				if(item_Lnm1.containsAll(item_L1) == false){
					ArrayList<String> candidate = new ArrayList<String>();
					candidate.addAll(item_Lnm1);
					candidate.addAll(item_L1);
	
					C.add_item(candidate, 0);
				}
			}
		}
	}
}
