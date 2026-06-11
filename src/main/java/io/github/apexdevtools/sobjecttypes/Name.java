/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class Name extends SObject {
	public static SObjectType$<Name> SObjectType;
	public static SObjectFields$<Name> Fields;

	public String Alias;
	public String Email;
	public String FirstName;
	public Id Id;
	public Boolean IsActive;
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
	public String Username;

	public Name clone$() {throw new java.lang.UnsupportedOperationException();}
	public Name clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Name clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Name clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Name clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
