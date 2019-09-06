using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Switch : MonoBehaviour {

    public int selectedLevel;

    private int easy = 0;
    private int medium = 1;
    private int hard = 2;

	// Use this for initialization
	void Start () {

        //If then version 
        /*
            if (selectedLevel == 0)
            {
                Debug.Log("You selected easy.");
            }

            else if (selectedLevel == 1)
            {
                Debug.Log("You selected medium.");
            }

            else if(selectedLevel == 2)
            {
                Debug.Log("You selected hard");
            }

            else
            {
                Debug.Log("This is the default case.");
            }
         **/

        //Switch version

        switch(selectedLevel) 
        {
            case 0: //if selected level == 0
                Debug.Log("It's easy");
                break;

            case 1: //else if selected level == 1
                Debug.Log("It's medium.");
                break;

            case 2: //else if selected level == 2
                Debug.Log("It is hard.");
                break;

            default: //else
                Debug.Log("It's default.");
                break;
        }
    }


    // Update is called once per frame
    void Update () {
		
	}
}
