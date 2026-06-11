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
