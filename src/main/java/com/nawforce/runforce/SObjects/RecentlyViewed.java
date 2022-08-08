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
public class RecentlyViewed extends SObject {
	public static SObjectType$<RecentlyViewed> SObjectType;
	public static SObjectFields$<RecentlyViewed> Fields;

	public com.nawforce.runforce.System.String Alias;
	public com.nawforce.runforce.System.String Email;
	public com.nawforce.runforce.System.String FirstName;
	public Id Id;
	public com.nawforce.runforce.System.Boolean IsActive;
	public com.nawforce.runforce.System.String Language;
	public com.nawforce.runforce.System.String LastName;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public com.nawforce.runforce.System.String Name;
	public com.nawforce.runforce.System.String NameOrAlias;
	public com.nawforce.runforce.System.String Phone;
	public Id ProfileId;
	public Profile Profile;
	public Id RecordTypeId;
	public RecordType RecordType;
	public com.nawforce.runforce.System.String Title;
	public com.nawforce.runforce.System.String Type;
	public Id UserRoleId;
	public UserRole UserRole;

	public RecentlyViewed clone$() {throw new java.lang.UnsupportedOperationException();}
	public RecentlyViewed clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public RecentlyViewed clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public RecentlyViewed clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public RecentlyViewed clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
