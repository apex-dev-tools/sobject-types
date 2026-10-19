/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.eventbus.ChangeEventHeader;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class BusinessLimitPendingTrxnChangeEvent extends SObject {
	public static SObjectType$<BusinessLimitPendingTrxnChangeEvent> SObjectType;
	public static SObjectFields$<BusinessLimitPendingTrxnChangeEvent> Fields;

	public Id BusinessLimitTrackerId;
	public BusinessLimitTracker BusinessLimitTracker;
	public ChangeEventHeader ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String ReplayId;
	public String RequestKey;
	public Integer ReservedUsageValue;

	public BusinessLimitPendingTrxnChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public BusinessLimitPendingTrxnChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public BusinessLimitPendingTrxnChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public BusinessLimitPendingTrxnChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public BusinessLimitPendingTrxnChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
