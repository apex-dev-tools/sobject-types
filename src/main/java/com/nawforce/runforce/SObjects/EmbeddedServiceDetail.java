/*
 Copyright (c) 2019 Kevin Jones, All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class EmbeddedServiceDetail extends SObject {
	public static SObjectType$<EmbeddedServiceDetail> SObjectType;
	public static SObjectFields$<EmbeddedServiceDetail> Fields;

	public com.nawforce.runforce.System.String AvatarImg;
	public com.nawforce.runforce.System.String ContrastInvertedColor;
	public com.nawforce.runforce.System.String ContrastPrimaryColor;
	public com.nawforce.runforce.System.String CustomMinimizedComponent;
	public com.nawforce.runforce.System.String CustomPrechatComponent;
	public com.nawforce.runforce.System.String DurableId;
	public com.nawforce.runforce.System.String FieldServiceConfirmCardImg;
	public com.nawforce.runforce.System.String FieldServiceHomeImg;
	public com.nawforce.runforce.System.String FieldServiceLogoImg;
	public com.nawforce.runforce.System.String Font;
	public com.nawforce.runforce.System.String FontSize;
	public com.nawforce.runforce.System.Integer Height;
	public Id Id;
	public com.nawforce.runforce.System.Boolean IsFieldServiceEnabled;
	public com.nawforce.runforce.System.Boolean IsLiveAgentEnabled;
	public com.nawforce.runforce.System.Boolean IsOfflineCaseEnabled;
	public com.nawforce.runforce.System.Boolean IsPrechatEnabled;
	public com.nawforce.runforce.System.Boolean IsQueuePositionEnabled;
	public com.nawforce.runforce.System.String NavBarColor;
	public com.nawforce.runforce.System.String NavBarTextColor;
	public com.nawforce.runforce.System.String OfflineCaseBackgroundImg;
	public com.nawforce.runforce.System.String PrechatBackgroundImg;
	public com.nawforce.runforce.System.String PrimaryColor;
	public com.nawforce.runforce.System.String SecondaryColor;
	public com.nawforce.runforce.System.String SecondaryNavBarColor;
	public com.nawforce.runforce.System.Boolean ShouldHideAuthDialog;
	public com.nawforce.runforce.System.Boolean ShouldShowExistingAppointment;
	public com.nawforce.runforce.System.Boolean ShouldShowNewAppointment;
	public com.nawforce.runforce.System.String Site;
	public com.nawforce.runforce.System.String SmallCompanyLogoImg;
	public com.nawforce.runforce.System.String WaitingStateBackgroundImg;
	public com.nawforce.runforce.System.Integer Width;

	public EmbeddedServiceDetail clone$() {throw new java.lang.UnsupportedOperationException();}
	public EmbeddedServiceDetail clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EmbeddedServiceDetail clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EmbeddedServiceDetail clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EmbeddedServiceDetail clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
