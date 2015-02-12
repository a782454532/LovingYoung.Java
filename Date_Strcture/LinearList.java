package lovingyoung;

public class LinearList{
	private int length;
	private final int MaxSize;
	private String[] elem;
	public LinearList(){
		this.length=0;
		this.MaxSize=20;
		this.elem=new String[MaxSize];
	}
	public String toString(){
		StringBuilder sb=new StringBuilder("");
		for(int i=0;i<length;i++){
			sb.append(elem[i]).append("||");
		}
		String s=new String(sb);
		return s;
	}
	public int getLength(){
		return this.length;
	}
	public boolean add(String o){
		if(length<MaxSize){
			elem[length]=o;
			length++;
			return true;
		}
		return false;
	}
	public boolean delete(int site){
		if(site<=length){
			for(int i=site-1;i<length-1;i++){
				elem[i]=elem[i+1];
			}
			length--;
			return true;
		}
		return false;
	}
	public boolean insert(String s,int site){
		if(site<1||site>length) return false;
		if(length>MaxSize-1) return false;
		for(int i=length;i>=site;i--){
			elem[i]=elem[i-1];
		}
		elem[site-1]=s;
		length++;
		return true;
	}
}
