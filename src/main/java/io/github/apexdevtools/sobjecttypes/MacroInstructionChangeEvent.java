/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class MacroInstructionChangeEvent extends SObject {
	public static SObjectType$<MacroInstructionChangeEvent> SObjectType;
	public static SObjectFields$<MacroInstructionChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id MacroId;
	public Macro Macro;
	public String Name;
	public String Operation;
	public String ReplayId;
	public Integer SortOrder;
	public String Target;
	public String Value;
	public String ValueRecord;

	public MacroInstructionChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public MacroInstructionChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MacroInstructionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MacroInstructionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MacroInstructionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
