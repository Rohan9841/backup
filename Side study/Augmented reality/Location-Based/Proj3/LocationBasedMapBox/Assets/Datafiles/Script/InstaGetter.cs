using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class InstaGetter : MonoBehaviour {

	// Use this for initialization
	IEnumerator Start () {
        string url = "https://api.instagram.com/v1/locations/search?lat=48.858844&lng=2.294351&access_token=7092444400.02aedcd.1d411a3d762c4fcba4109f5e89607a1e";
        WWW www = new WWW(url);
        yield return www;

        string api_response = www.text;
        Debug.Log(api_response);
    }
	
	// Update is called once per frame
	void Update () {
		
	}
}
