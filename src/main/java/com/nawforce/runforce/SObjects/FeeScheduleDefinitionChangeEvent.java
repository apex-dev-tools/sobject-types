/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class FeeScheduleDefinitionChangeEvent extends SObject {
	public static SObjectType$<FeeScheduleDefinitionChangeEvent> SObjectType;
	public static SObjectFields$<FeeScheduleDefinitionChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Datetime EffectiveEndDateTime;
	public Datetime EffectiveStartDateTime;
	public String FeeScheduleDefinitionKey;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String ReplayId;

	public FeeScheduleDefinitionChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public FeeScheduleDefinitionChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FeeScheduleDefinitionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FeeScheduleDefinitionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FeeScheduleDefinitionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
