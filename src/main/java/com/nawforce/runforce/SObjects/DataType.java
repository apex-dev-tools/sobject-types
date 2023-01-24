/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Id;
import com.nawforce.runforce.System.SObject;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class DataType extends SObject {
	public static SObjectType$<DataType> SObjectType;
	public static SObjectFields$<DataType> Fields;

	public String ContextServiceDataTypeId;
	public String ContextWsdlDataTypeId;
	public String DeveloperName;
	public String DurableId;
	public Id Id;
	public Boolean IsComplex;

	public DataType clone$() {throw new java.lang.UnsupportedOperationException();}
	public DataType clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DataType clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DataType clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DataType clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
