/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class MktDataConnectionParam extends SObject {
	public static SObjectType$<MktDataConnectionParam> SObjectType;
	public static SObjectFields$<MktDataConnectionParam> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DeveloperName;
	public Id Id;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public Id MktDataConnectionId;
	public MktDataConnection MktDataConnection;
	public String NamespacePrefix;
	public String ParamName;
	public Datetime SystemModstamp;
	public String Value;

	public MktDataConnectionParam clone$() {throw new java.lang.UnsupportedOperationException();}
	public MktDataConnectionParam clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MktDataConnectionParam clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MktDataConnectionParam clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MktDataConnectionParam clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
