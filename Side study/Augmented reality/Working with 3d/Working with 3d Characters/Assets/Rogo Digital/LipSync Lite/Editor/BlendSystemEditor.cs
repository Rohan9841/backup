using UnityEngine;
using UnityEditor;

using System;
using System.IO;
using System.Reflection;
using System.Collections.Generic;

using RogoDigital;
using RogoDigital.Lipsync;

[CustomEditor(typeof(BlendSystem), true)]
public class BlendSystemEditor : BlendSystemEditorBase {

	[MenuItem("Assets/Create/LipSync Pro/Empty BlendSystem")]
	public static void CreateNewBlendSystem () {
		string path = AssetDatabase.GetAssetPath(Selection.activeObject);

		if (path == "") {
			path = "Assets";
		} else if (Path.GetExtension(path) != "") {
			path = path.Replace(Path.GetFileName(AssetDatabase.GetAssetPath(Selection.activeObject)), "");
		} else {
			path += "/";
		}

		string[] guids = AssetDatabase.FindAssets("NewBlendSystemTemplate t:TextAsset");
		string textpath = "";

		if (guids.Length > 0) {
			textpath = AssetDatabase.GUIDToAssetPath(guids[0]);
		}

		StreamWriter writer = File.CreateText(Path.GetFullPath(path) + "MyNewBlendSystem.cs");
		StreamReader reader = File.OpenText(Path.GetFullPath(textpath));

		string line;
		while ((line = reader.ReadLine()) != null) {
			writer.WriteLine(line);
		}

		writer.Close();
		reader.Close();

		AssetDatabase.Refresh();
		Selection.activeObject = AssetDatabase.LoadAssetAtPath(path + "MyNewBlendSystem.cs", typeof(object));
	}
}
