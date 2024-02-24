public class Domino {
    private int top;
    private int bottom;
    public Domino(){
        this.top = 0;
        this.bottom = 0;
    }
    public Domino(int top, int bottom){
        this.top = top;
        this.bottom = bottom;
    }
    public int getTop(){
        return top;
    }
    public int getBottom(){
        return bottom;
    }
    public void setTop(int top){
        this.top = top;
    }
    public void setBottom(int bottom){
        this.bottom = bottom;
    }
    public String toString(){
        return Integer.toString(top)+"/"+Integer.toString(bottom);
    }
    public void flip(){
        int previousTop = this.top;
        top = bottom;
        bottom = previousTop;
    }
    public void settle(){
        if (bottom<top){
            flip();
        }
    }
    public int compareTo(Domino other){
        flip();
        other.flip();
        if (top==other.top){
            if(bottom<other.bottom){
                return -1;
            }
            if (bottom>other.bottom){
                return 1;
            }
            if (bottom==other.bottom){
                return 0;
            }
        }else if (top<other.top){
            return -1;
        } return 1;
    }
    public int compareToWeight(Domino other){
        int thisDomino = getTop()+getBottom();
        int otherDomino = other.getTop()+other.getBottom();
        if(thisDomino<otherDomino){
            return -1;
        }if (thisDomino>otherDomino){
            return 1;
        } return 0;
    }
    public boolean canConnect(Domino other){
        if (this.top==other.top){
            return true;
        }if (this.top==other.bottom){
            return true;
        }if (this.bottom==other.top){
            return true;
        }if (this.bottom==other.bottom){
            return true;
        } return false;
    }

}
