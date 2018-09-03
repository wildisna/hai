       //in JTextField - right click - Events - Key -KeyType
       private void nameKeyTyped(java.awt.event.KeyEvent evt) {                               
                char c=evt.getKeyChar();
                if(!(Character.isDigit(c)||c=='.')){
                  evt.consume() ; 
                }
        }
