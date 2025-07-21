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
public class OmniIntegrationProcdView extends SObject {
	public static SObjectType$<OmniIntegrationProcdView> SObjectType;
	public static SObjectFields$<OmniIntegrationProcdView> Fields;

	public String CurrencyIsoCode;
	public String Description;
	public String ExternalId;
	public Id Id;
	public String IntegrationProcedureInput;
	public String IntegrationProcedureName;
	public String IntegrationProcedureOutput;
	public Boolean IsActive;
	public Boolean IsFileBased;
	public Boolean IsIntegProcdSignatureAvl;
	public Boolean IsManagedUsingStdDesigner;
	public Boolean IsTestProcedure;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id OmniProcessId;
	public OmniProcess OmniProcess;
	public String SubType;
	public String Type;
	public Integer VersionCount;
	public Decimal VersionNumber;

	public OmniIntegrationProcdView clone$() {throw new java.lang.UnsupportedOperationException();}
	public OmniIntegrationProcdView clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OmniIntegrationProcdView clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OmniIntegrationProcdView clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OmniIntegrationProcdView clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
