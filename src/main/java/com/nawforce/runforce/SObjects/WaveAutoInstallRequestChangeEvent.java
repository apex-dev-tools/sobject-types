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
public class WaveAutoInstallRequestChangeEvent extends SObject {
	public static SObjectType$<WaveAutoInstallRequestChangeEvent> SObjectType;
	public static SObjectFields$<WaveAutoInstallRequestChangeEvent> Fields;

	public Object ChangeEventHeader;
	public String Configuration;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String FailedReason;
	public Id FolderId;
	public Folder Folder;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String ReplayId;
	public String RequestLog;
	public String RequestStatus;
	public String RequestType;
	public String TemplateApiName;
	public String TemplateVersion;

	public WaveAutoInstallRequestChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public WaveAutoInstallRequestChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WaveAutoInstallRequestChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WaveAutoInstallRequestChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WaveAutoInstallRequestChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
