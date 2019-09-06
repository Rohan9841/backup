using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class RotateSphere : MonoBehaviour {

    public Vector3 rotatingAxis;
    
	// Use this for initialization
	void Start () {
        rotatingAxis = new Vector3(0, 45, 0);
	}
	
	// Update is called once per frame
	void Update () {
        transform.Rotate(rotatingAxis * Time.deltaTime);
	}
}
