public class Category {
    String categoryName;
    Staff[] staffArr = new Staff[10];
    public Category(){}
    public Category(String categoryName, Staff[] staffArr){
        this.categoryName = categoryName;
        this.staffArr = staffArr;

    }
    public String staffInfo(){
        String res = String.format("Имя категории: %s\n-----------\n",categoryName );
            for(Staff i: staffArr){
                res+=i.staffInfo();
            }

        return res+"========================\n";
    }
}
