package com.dayone;

import org.apache.commons.collections4.Trie;
import org.apache.commons.collections4.trie.PatriciaTrie;

public class AutoComplete {

    private Trie trie;

    public AutoComplete(Trie trie) {
        this.trie = trie;
    }

    public Object get(String s) {
        return this.trie.get(s);
    }
}
