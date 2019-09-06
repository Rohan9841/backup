using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Variable : MonoBehaviour {

    private int age = 22;
    private string sex = "Male";
    public string location; 

	// Use this for initialization
	void Start () {
        Debug.Log("age: " + age + " sex: " + sex + "\nlocation: " + location);
    }
	
	// Update is called once per frame
	void Update () {
		
	}
}
