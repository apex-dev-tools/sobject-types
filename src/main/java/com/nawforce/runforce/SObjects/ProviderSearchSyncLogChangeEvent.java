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
public class ProviderSearchSyncLogChangeEvent extends SObject {
	public static SObjectType$<ProviderSearchSyncLogChangeEvent> SObjectType;
	public static SObjectFields$<ProviderSearchSyncLogChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id FacilityId;
	public Account Facility;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastSync;
	public String Message;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id ProviderId;
	public HealthcareProvider Provider;
	public String ProviderName;
	public String ReplayId;
	public String SyncStatus;

	public ProviderSearchSyncLogChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ProviderSearchSyncLogChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ProviderSearchSyncLogChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ProviderSearchSyncLogChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ProviderSearchSyncLogChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
