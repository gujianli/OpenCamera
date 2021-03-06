/*
The contents of this file are subject to the Mozilla Public License
Version 1.1 (the "License"); you may not use this file except in
compliance with the License. You may obtain a copy of the License at
http://www.mozilla.org/MPL/

Software distributed under the License is distributed on an "AS IS"
basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
License for the specific language governing rights and limitations
under the License.

The Original Code is collection of files collectively known as Open Camera.

The Initial Developer of the Original Code is Almalence Inc.
Portions created by Initial Developer are Copyright (C) 2013 
by Almalence Inc. All Rights Reserved.
*/

package com.almalence.opencam;

import android.hardware.Camera;

public abstract class PluginCapture extends Plugin
{
	public PluginCapture(String ID,
						 int preferenceID,
						 int advancedPreferenceID,
						 String preferenceTitle,
						 String preferenceSummary,
						 int quickControlID,
						 String quickControlInitTitle)
	{
		super(ID, preferenceID, advancedPreferenceID, preferenceTitle, preferenceSummary, quickControlID, quickControlInitTitle);		
	}
	
	@Override
	abstract public void OnShutterClick();
	
	@Override
	abstract public void onAutoFocus(boolean paramBoolean, Camera paramCamera);
	
	@Override
	abstract public void onPictureTaken(byte[] paramArrayOfByte, Camera paramCamera);
	
	@Override
	abstract public void onPreviewFrame(byte[] data, Camera paramCamera);
}
