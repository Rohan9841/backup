using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class IfThen : MonoBehaviour {

    public bool isAlive = true;
    public int health = 100;

	// Use this for initialization

	void Start () {
		
	}
	
	// Update is called once per frame
	void Update () {
        if (health > 0)
        {
            isAlive = true;
            Debug.Log("You are alive.");
        }
        else
        {
            isAlive = false;
            Debug.Log("You are dead.");
        }
    }
}
