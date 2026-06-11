/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Id;
import io.github.apexdevtools.standardtypes.System.SObject;
import io.github.apexdevtools.standardtypes.System.String;

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
