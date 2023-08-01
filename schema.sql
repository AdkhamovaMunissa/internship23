CREATE TABLE product_lines (
  full_product_line VARCHAR(255),
  source_db_name VARCHAR(255),
  plant_code VARCHAR(50),
  location_code VARCHAR(50),
  line_no INT,
  line_desc VARCHAR(255),
  etl_creation_date DATETIME,
  etl_last_updated_date DATETIME
);

CREATE TABLE pbc (
    full_product_line VARCHAR(50),
    source_db_name VARCHAR(255),
    pbc VARCHAR(255),
    product_code VARCHAR(255),
    tracked VARCHAR(10),
    rec_time DATETIME2,
    raw_min_time DATETIME2,
    raw_max_time DATETIME2,
    etl_batch_id VARCHAR(255),
    creation_date DATETIME2,
    creation_by VARCHAR(255),
    last_updated_date DATETIME2,
    last_updated_by VARCHAR(255)
);

CREATE TABLE traceability_basic(
    full_product_line VARCHAR(50),
    source_db_name VARCHAR(50),
    pbc VARCHAR(50),
    original_id VARCHAR(50),
    mode_type VARCHAR(50),
    rec_time DATETIME2,
    etl_batch_id VARCHAR(255),
    creation_date DATETIME2,
    creation_by VARCHAR(255),
    last_updated_date DATETIME2,
    last_updated_by VARCHAR(255)
);

CREATE TABLE finished_goods_details (
    full_product_line VARCHAR(50),
    component_uuid VARCHAR(50),
    manu_mode_code VARCHAR(50),
    original_id VARCHAR(50),
    etl_datasource_num_id INT,
    etl_integration_key INT,
    etl_creation_date VARCHAR(50),
    etl_last_updated_date VARCHAR(50),
    etl_batch_id VARCHAR(50),
    etl_db_code VARCHAR(255),
    plant_code VARCHAR(50),
    location_code VARCHAR(50),
    line_no VARCHAR(50),
    line_desc VARCHAR(50),
    product_code VARCHAR(50),
    product_desc VARCHAR(50),
    process_no VARCHAR(50),
    process_code VARCHAR(50),
    process_desc VARCHAR(50),
    pbc VARCHAR(50),
    bar_code1 VARCHAR(255),
    bar_code2 VARCHAR(50),
    equipment_no VARCHAR(50),
    equipment_code VARCHAR(50),
    equipment_function VARCHAR(255),
    sequence_no INT,
    start_date VARCHAR(50),
    end_date VARCHAR(50),
    transfer_date VARCHAR(50),
    process_status VARCHAR(50),
    rec_message VARCHAR(50),
    rec_uuid VARCHAR(50),
    q_mode_status VARCHAR(50),
    q_rec_flag VARCHAR(50),
    fg_lot_no VARCHAR(50),
    mt_lot_no VARCHAR(255),
    final_process_flag VARCHAR(50),
    final_finished_date VARCHAR(50),
    fg_year INT,
    fg_month INT,
    meas_name VARCHAR(50),
    meas_desc VARCHAR(255),
    meas_seq_no INT,
    spec_min VARCHAR(50),
    spec_max VARCHAR(50),
    spec_mid VARCHAR(50),
    spec_str VARCHAR(50),
    meas_valid_flag VARCHAR(50),
    meas_value VARCHAR(50),
    meas_value_str VARCHAR(50),
    meas_value_date VARCHAR(50),
    meas_value_boolean BIT
);

CREATE TABLE finished_goods_basic (
    full_product_line VARCHAR(50),
    component_uuid VARCHAR(50),
    manu_mode_code VARCHAR(50),
    original_id VARCHAR(50),
    etl_datasource_num_id INT,
    etl_integration_key INT,
    etl_creation_date VARCHAR(50),
    etl_last_updated_date VARCHAR(50),
    etl_batch_id VARCHAR(50),
    etl_db_code VARCHAR(255),
    plant_code VARCHAR(50),
    location_code VARCHAR(50),
    line_no VARCHAR(50),
    line_desc VARCHAR(50),
    product_code VARCHAR(50),
    product_desc VARCHAR(50),
    process_no VARCHAR(50),
    process_code VARCHAR(50),
    process_desc VARCHAR(50),
    pbc VARCHAR(50),
    bar_code1 VARCHAR(255),
    bar_code2 VARCHAR(50),
    equipment_no VARCHAR(50),
    equipment_code VARCHAR(50),
    equipment_function VARCHAR(255),
    sequence_no INT,
    start_date VARCHAR(50),
    end_date VARCHAR(50),
    transfer_date VARCHAR(50),
    process_status VARCHAR(50),
    rec_message VARCHAR(50),
    rec_uuid VARCHAR(50),
    q_mode_status VARCHAR(50),
    q_rec_flag VARCHAR(50),
    fg_lot_no VARCHAR(50),
    mt_lot_no VARCHAR(255),
    final_process_flag VARCHAR(50),
    final_finished_date VARCHAR(50),
    fg_year INT,
    fg_month INT,
);

CREATE DATABASE SCOPED CREDENTIAL AzBlobStorageCredential
WITH IDENTITY = 'SHARED ACCESS SIGNATURE',
SECRET = 'sv=2022-11-02&ss=bfqt&srt=sco&sp=rwdlacupiytfx&se=2023-08-31T11:50:41Z&st=2023-07-31T03:50:41Z&spr=https&sig=mXEHzTPDs6immEvTr6FHqiTir1mx6iZDblbsDsp07bw%3D'

CREATE EXTERNAL DATA SOURCE azblob
WITH ( TYPE = BLOB_STORAGE, 
LOCATION = 'https://apidatabase.blob.core.windows.net',
CREDENTIAL= AzBlobStorageCredential);

BULK INSERT product_lines
FROM 'blobforapi/traceability_production_lines.csv'
WITH ( DATA_SOURCE = 'azblob', FORMAT = 'CSV',
FIRSTROW = 2);

BULK INSERT pbc
FROM 'blobforapi/traceability_pbc.csv'
WITH ( DATA_SOURCE = 'azblob', FORMAT = 'CSV',
FIRSTROW = 2);

BULK INSERT traceability_basic
FROM 'blobforapi/traceability_basic.csv'
WITH ( DATA_SOURCE = 'azblob', FORMAT = 'CSV',
FIRSTROW = 2);

BULK INSERT finished_goods_details
FROM 'blobforapi/finished_goods_details2.csv'
WITH ( DATA_SOURCE = 'azblob', FORMAT = 'CSV',
FIRSTROW = 2);
