/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class CareProgramGoalChangeEvent extends SObject {
	public static SObjectType$<CareProgramGoalChangeEvent> SObjectType;
	public static SObjectFields$<CareProgramGoalChangeEvent> Fields;

	public Id CareProgramId;
	public CareProgram CareProgram;
	public Object ChangeEventHeader;
	public Date CompletionDate;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Date DueDate;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String Priority;
	public Decimal ProgressPercentage;
	public String ReplayId;
	public Decimal SequenceNumber;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Date StartDate;
	public String Status;

	public CareProgramGoalChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CareProgramGoalChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CareProgramGoalChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CareProgramGoalChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CareProgramGoalChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
