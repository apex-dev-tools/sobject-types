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
public class ApplicationFormProductChangeEvent extends SObject {
	public static SObjectType$<ApplicationFormProductChangeEvent> SObjectType;
	public static SObjectFields$<ApplicationFormProductChangeEvent> Fields;

	public String ApplicantVisibleStatus;
	public Id ApplicationFormId;
	public ApplicationForm ApplicationForm;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Boolean HasElectronicStatement;
	public Id Id;
	public Boolean IsAtmCardRequired;
	public Boolean IsCheckbookRequired;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String OwnershipType;
	public Id ProductId;
	public Product2 Product;
	public String ReplayId;
	public String Stage;

	public ApplicationFormProductChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ApplicationFormProductChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ApplicationFormProductChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ApplicationFormProductChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ApplicationFormProductChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
