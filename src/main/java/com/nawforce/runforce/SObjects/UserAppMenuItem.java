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
public class UserAppMenuItem extends SObject {
	public static SObjectType$<UserAppMenuItem> SObjectType;
	public static SObjectFields$<UserAppMenuItem> Fields;

	public com.nawforce.runforce.System.String AppMenuItemId;
	public Id ApplicationId;
	public SObject Application;
	public com.nawforce.runforce.System.String Description;
	public com.nawforce.runforce.System.String IconUrl;
	public Id Id;
	public com.nawforce.runforce.System.String InfoUrl;
	public com.nawforce.runforce.System.Boolean IsUsingAdminAuthorization;
	public com.nawforce.runforce.System.Boolean IsVisible;
	public com.nawforce.runforce.System.String Label;
	public com.nawforce.runforce.System.String LogoUrl;
	public com.nawforce.runforce.System.String MobileStartUrl;
	public com.nawforce.runforce.System.String Name;
	public com.nawforce.runforce.System.Integer SortOrder;
	public com.nawforce.runforce.System.String StartUrl;
	public com.nawforce.runforce.System.String Type;
	public com.nawforce.runforce.System.Integer UserSortOrder;

	public UserAppMenuItem clone$() {throw new java.lang.UnsupportedOperationException();}
	public UserAppMenuItem clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public UserAppMenuItem clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public UserAppMenuItem clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public UserAppMenuItem clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
