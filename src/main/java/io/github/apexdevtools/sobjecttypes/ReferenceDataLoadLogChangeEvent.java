/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ReferenceDataLoadLogChangeEvent extends SObject {
	public static SObjectType$<ReferenceDataLoadLogChangeEvent> SObjectType;
	public static SObjectFields$<ReferenceDataLoadLogChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DatasetExternalIdentifier;
	public String DatasetName;
	public String DatasetType;
	public String Description;
	public String ErrorMessage;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LoadDateTime;
	public String LoadStatus;
	public Id LoadedById;
	public User LoadedBy;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String Provider;
	public String ReplayId;
	public String Source;
	public Integer TotalLoadedRecordCount;
	public Integer TotalSkippedRecordCount;
	public Decimal TotalTime;
	public String UsageType;
	public String VersionNameTag;
	public String VersionNumber;

	public ReferenceDataLoadLogChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ReferenceDataLoadLogChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ReferenceDataLoadLogChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ReferenceDataLoadLogChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ReferenceDataLoadLogChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
