/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ESignatureEnvelopeConfig extends SObject {
	public static SObjectType$<ESignatureEnvelopeConfig> SObjectType;
	public static SObjectFields$<ESignatureEnvelopeConfig> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DeveloperName;
	public Integer ExpirationPeriod;
	public Integer ExpirationWarningPeriod;
	public Integer FirstReminderPeriod;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsExpirationEnabled;
	public Boolean IsReminderEnabled;
	public Boolean IsVendorDefaultNtfcnEnabled;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String NamespacePrefix;
	public Integer ReminderIntervalPeriod;
	public Datetime SystemModstamp;
	public String TargetObjectName;
	public String Vendor;
	public String VendorAccountIdentifier;

	public ESignatureEnvelopeConfig clone$() {throw new java.lang.UnsupportedOperationException();}
	public ESignatureEnvelopeConfig clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ESignatureEnvelopeConfig clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ESignatureEnvelopeConfig clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ESignatureEnvelopeConfig clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
