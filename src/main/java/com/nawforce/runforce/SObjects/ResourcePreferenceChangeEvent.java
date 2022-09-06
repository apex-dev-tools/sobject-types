/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ResourcePreferenceChangeEvent extends SObject {
	public static SObjectType$<ResourcePreferenceChangeEvent> SObjectType;
	public static SObjectFields$<ResourcePreferenceChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String PreferenceType;
	public Id RelatedRecordId;
	public SObject RelatedRecord;
	public String ReplayId;
	public String ResourcePreferenceNumber;
	public Id ServiceResourceId;
	public ServiceResource ServiceResource;

	public ResourcePreferenceChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ResourcePreferenceChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ResourcePreferenceChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ResourcePreferenceChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ResourcePreferenceChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
