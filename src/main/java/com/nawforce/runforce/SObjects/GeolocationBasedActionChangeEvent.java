/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class GeolocationBasedActionChangeEvent extends SObject {
	public static SObjectType$<GeolocationBasedActionChangeEvent> SObjectType;
	public static SObjectFields$<GeolocationBasedActionChangeEvent> Fields;

	public String ActionData;
	public String ActionType;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id Id;
	public Datetime InitialTimeInvoked;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastTimeInvoked;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Integer Radius;
	public Id ReferenceRecordId;
	public SObject ReferenceRecord;
	public String ReplayId;
	public String TriggerType;

	public GeolocationBasedActionChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public GeolocationBasedActionChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public GeolocationBasedActionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public GeolocationBasedActionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public GeolocationBasedActionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
