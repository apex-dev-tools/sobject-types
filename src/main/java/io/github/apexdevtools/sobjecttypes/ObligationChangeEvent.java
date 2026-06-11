/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ObligationChangeEvent extends SObject {
	public static SObjectType$<ObligationChangeEvent> SObjectType;
	public static SObjectFields$<ObligationChangeEvent> Fields;

	public Id AssigneeUserId;
	public User AssigneeUser;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Date EndDate;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OtherPartyAccountId;
	public Account OtherPartyAccount;
	public Id OwnerId;
	public User Owner;
	public String Party;
	public Id ReferenceContractId;
	public Contract ReferenceContract;
	public Id ReferenceObjectId;
	public Contract ReferenceObject;
	public String ReplayId;
	public Date StartDate;
	public String State;
	public String Status;
	public String StatusChangeReason;
	public String Type;

	public ObligationChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ObligationChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ObligationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ObligationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ObligationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
