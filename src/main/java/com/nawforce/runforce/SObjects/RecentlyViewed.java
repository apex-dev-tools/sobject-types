/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class RecentlyViewed extends SObject {
	public static SObjectType$<RecentlyViewed> SObjectType;
	public static SObjectFields$<RecentlyViewed> Fields;

	public String Alias;
	public String Email;
	public String FirstName;
	public Id Id;
	public Boolean IsActive;
	public String Language;
	public String LastName;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public String NameOrAlias;
	public String Phone;
	public Id ProfileId;
	public Profile Profile;
	public Id RecordTypeId;
	public RecordType RecordType;
	public String Title;
	public String Type;
	public Id UserRoleId;
	public UserRole UserRole;

	public RecentlyViewed clone$() {throw new java.lang.UnsupportedOperationException();}
	public RecentlyViewed clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public RecentlyViewed clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public RecentlyViewed clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public RecentlyViewed clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
