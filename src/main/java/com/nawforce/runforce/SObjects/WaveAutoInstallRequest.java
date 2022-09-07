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
public class WaveAutoInstallRequest extends SObject {
	public static SObjectType$<WaveAutoInstallRequest> SObjectType;
	public static SObjectFields$<WaveAutoInstallRequest> Fields;

	public String Configuration;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String FailedReason;
	public Id FolderId;
	public Folder Folder;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String RequestLog;
	public String RequestStatus;
	public String RequestType;
	public Datetime SystemModstamp;
	public String TemplateApiName;
	public String TemplateVersion;

	public WaveCompatibilityCheckItem[] WaveCompatibilityCheckItems;

	public WaveAutoInstallRequest clone$() {throw new java.lang.UnsupportedOperationException();}
	public WaveAutoInstallRequest clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WaveAutoInstallRequest clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WaveAutoInstallRequest clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WaveAutoInstallRequest clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}