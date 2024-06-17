/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

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
