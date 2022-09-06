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
public class ApexTypeImplementor extends SObject {
	public static SObjectType$<ApexTypeImplementor> SObjectType;
	public static SObjectFields$<ApexTypeImplementor> Fields;

	public Id ApexClassId;
	public ApexClass ApexClass;
	public String ClassName;
	public String ClassNamespacePrefix;
	public String DurableId;
	public Id Id;
	public Id InterfaceApexClassId;
	public ApexClass InterfaceApexClass;
	public String InterfaceName;
	public String InterfaceNamespacePrefix;
	public Boolean IsConcrete;

	public ApexTypeImplementor clone$() {throw new java.lang.UnsupportedOperationException();}
	public ApexTypeImplementor clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ApexTypeImplementor clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ApexTypeImplementor clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ApexTypeImplementor clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
