/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class OmniScriptView extends SObject {
	public static SObjectType$<OmniScriptView> SObjectType;
	public static SObjectFields$<OmniScriptView> Fields;

	public String CurrencyIsoCode;
	public String Description;
	public String ExternalId;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsEmbeddable;
	public Boolean IsFileBased;
	public Boolean IsManagedUsingStdDesigner;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id OmniProcessId;
	public OmniProcess OmniProcess;
	public String OmniscriptName;
	public String SubType;
	public String Type;
	public Integer VersionCount;
	public Decimal VersionNumber;
	public String WarningMessage;

	public OmniScriptView clone$() {throw new java.lang.UnsupportedOperationException();}
	public OmniScriptView clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OmniScriptView clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OmniScriptView clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OmniScriptView clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
