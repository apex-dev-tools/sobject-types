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
public class UriEvent extends SObject {
	public static SObjectType$<UriEvent> SObjectType;
	public static SObjectFields$<UriEvent> Fields;

	public Datetime CreatedDate;
	public Datetime EventDate;
	public String EventIdentifier;
	public Id Id;
	public String LoginKey;
	public String Message;
	public String Name;
	public String Operation;
	public String OperationStatus;
	public Id ProfileId;
	public Profile Profile;
	public String QueriedEntities;
	public Id RecordId;
	public SObject Record;
	public String RelatedEventIdentifier;
	public Id RoleId;
	public UserRole Role;
	public String SessionKey;
	public String SessionLevel;
	public String SourceIp;
	public Id UserId;
	public User User;
	public String UserType;
	public String Username;

	public UriEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public UriEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public UriEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public UriEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public UriEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
