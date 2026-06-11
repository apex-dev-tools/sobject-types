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
public class ProcessExceptionChangeEvent extends SObject {
	public static SObjectType$<ProcessExceptionChangeEvent> SObjectType;
	public static SObjectFields$<ProcessExceptionChangeEvent> Fields;

	public Id AssetId;
	public Asset Asset;
	public Id AttachedToId;
	public SObject AttachedTo;
	public Id CaseId;
	public Case Case;
	public String Category;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String ExternalReference;
	public Id GroupById;
	public AsyncOperationTracker GroupBy;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Message;
	public Id OwnerId;
	public User Owner;
	public String Priority;
	public String ProcessExceptionNumber;
	public String ReplayId;
	public String Severity;
	public String SeverityCategory;
	public String Status;
	public String StatusCategory;

	public ProcessExceptionChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ProcessExceptionChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ProcessExceptionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ProcessExceptionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ProcessExceptionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
