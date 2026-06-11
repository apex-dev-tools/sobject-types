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
public class PcmtEmssnFctrSetItemChangeEvent extends SObject {
	public static SObjectType$<PcmtEmssnFctrSetItemChangeEvent> SObjectType;
	public static SObjectFields$<PcmtEmssnFctrSetItemChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String EconomicSector;
	public String EconomicSectorCategory;
	public String EconomicSectorCode;
	public String ExternalIdentifier;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id PcmtEmssnFctrSetId;
	public PcmtEmssnFctrSet PcmtEmssnFctrSet;
	public Id ReferenceDataLoadLogId;
	public ReferenceDataLoadLog ReferenceDataLoadLog;
	public String Region;
	public String ReplayId;
	public String Scope3GhgCategory;
	public Boolean ShouldLockDtastUpdtForRec;
	public Decimal TotScpe3EmssnPerMillionSpent;

	public PcmtEmssnFctrSetItemChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public PcmtEmssnFctrSetItemChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PcmtEmssnFctrSetItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PcmtEmssnFctrSetItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PcmtEmssnFctrSetItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
