using System;
using System.Collections.Generic;

class Palindrome {
  
    Stack <char> charStack;
    Queue <char> charQueue;
    
    public Palindrome() {
        charStack = new Stack<char>();
        charQueue = new Queue<char>();
    }
    
    //Last in First Out
    public void pushCharacter(char ch) {
        charStack.Push(ch);
    }
    
    //First in First Out
    public void enqueueCharacter(char ch) {
        charQueue.Enqueue(ch);
    }
    public char popCharacter() {
        return charStack.Pop();
    }
    public char dequeueCharacter() {
        return charQueue.Dequeue();
    }

    
}

int main() {
    // read the string s.
    string s;
    getline(cin, s);
    
    // create the Palindrome class object p.
    Palindrome p;
    
    // push all the characters of string s to stack.
    for (int i = 0; i < s.length(); i++) {
        p.pushCharacter(s[i]);
    }
    
    // enqueue all the characters of string s to queue.
    for (int i = 0; i < s.length(); i++) {
        p.enqueueCharacter(s[i]);
    }
    
    bool f = true;
    
    // pop the top character from stack.
    // dequeue the first character from queue.
    // compare both the characters.
    for (int i = 0; i < s.length(); i++) {
        if (p.popCharacter() != p.dequeueCharacter()) {
            f = false;
            
            break;
        }
    }
    
    // finally print whether string s is palindrome or not.
    if (f) {
        cout << "The word, " << s << ", is a palindrome.";
    } else {
        cout << "The word, " << s << ", is not a palindrome.";
    }
    
    return 0;
}