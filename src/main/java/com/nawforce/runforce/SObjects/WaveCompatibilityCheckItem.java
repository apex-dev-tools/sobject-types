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
public class WaveCompatibilityCheckItem extends SObject {
	public static SObjectType$<WaveCompatibilityCheckItem> SObjectType;
	public static SObjectFields$<WaveCompatibilityCheckItem> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String Payload;
	public Datetime SystemModstamp;
	public String TaskName;
	public String TaskResult;
	public String TemplateApiName;
	public String TemplateVersion;
	public Id WaveAutoInstallRequestId;
	public WaveAutoInstallRequest WaveAutoInstallRequest;

	public WaveCompatibilityCheckItem clone$() {throw new java.lang.UnsupportedOperationException();}
	public WaveCompatibilityCheckItem clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WaveCompatibilityCheckItem clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WaveCompatibilityCheckItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WaveCompatibilityCheckItem clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
