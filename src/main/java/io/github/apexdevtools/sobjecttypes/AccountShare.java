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
public class AccountShare extends SObject {
	public static SObjectType$<AccountShare> SObjectType;
	public static SObjectFields$<AccountShare> Fields;

	public String AccountAccessLevel;
	public Id AccountId;
	public Account Account;
	public String CaseAccessLevel;
	public String ContactAccessLevel;
	public String Division;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String OpportunityAccessLevel;
	public String RowCause;
	public Id UserOrGroupId;
	public Name UserOrGroup;

	public AccountShare clone$() {throw new java.lang.UnsupportedOperationException();}
	public AccountShare clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AccountShare clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AccountShare clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AccountShare clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
