/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class BusProcessFeedbackConfig extends SObject {
	public static SObjectType$<BusProcessFeedbackConfig> SObjectType;
	public static SObjectFields$<BusProcessFeedbackConfig> Fields;

	public String ActionName;
	public String ActionType;
	public String ConfigurationDescription;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DeveloperName;
	public String Field;
	public String FieldValue;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String NamespacePrefix;
	public String Object;
	public String Recipient;
	public String RecordType;
	public Datetime SystemModstamp;
	public String TriggerAction;

	public BusProcessFeedbackConfig clone$() {throw new java.lang.UnsupportedOperationException();}
	public BusProcessFeedbackConfig clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public BusProcessFeedbackConfig clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public BusProcessFeedbackConfig clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public BusProcessFeedbackConfig clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
